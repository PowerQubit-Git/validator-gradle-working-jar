package org.mobilitydata.gtfsvalidator.controller;

import com.google.common.flogger.FluentLogger;
import com.google.gson.Gson;
import org.mobilitydata.gtfsvalidator.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
public class FileController {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            message = "Uploaded the file successfully: " + file.getOriginalFilename();

            Arguments arg = new Arguments(
                    file.getBytes()
                    ,null
                    ,"output"
                    ,3
                    ,"feed"
                    ,"pt"
                    ,"x"
                    ,"output"
                    ,"ms_val_rep.txt"
                    ,"ms_err_rep.txt"
                    ,false
                    ,false
                    ,false);

            ValidatorController vc = new ValidatorController();
            ValidationResult vr = vc.loadFeed(arg);

            Gson gson = new Gson();
            String jsonString = gson.toJson(vr);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(jsonString));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

}
