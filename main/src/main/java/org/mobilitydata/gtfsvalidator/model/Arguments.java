/*
 * Copyright 2020 Google LLC, MobilityData IO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mobilitydata.gtfsvalidator.model;

import org.apache.commons.compress.archivers.zip.ZipFile;
import org.mobilitydata.gtfsvalidator.input.GtfsZipFileInput;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/** Command-line arguments for GTFS Validator CLI. */
public class Arguments {
  private byte[] zipFile;
  private String input;
  private String outputBase;
  private int numThreads = 1;
  private String feedName;
  private String countryCode;
  private String url;
  private String storageDirectory;
  private String validationReportName;
  private String systemErrorsReportName;
  private boolean help = false;
  private boolean pretty = false;
  private boolean exportNoticeSchema = false;

  public Arguments() {
  }

  public Arguments(byte[] zipFile, String input, String outputBase, int numThreads, String feedName, String countryCode, String url, String storageDirectory, String validationReportName, String systemErrorsReportName, boolean help, boolean pretty, boolean exportNoticeSchema) {
    this.zipFile = zipFile;
    this.input = input;
    this.outputBase = outputBase;
    this.numThreads = numThreads;
    this.feedName = feedName;
    this.countryCode = countryCode;
    this.url = url;
    this.storageDirectory = storageDirectory;
    this.validationReportName = validationReportName;
    this.systemErrorsReportName = systemErrorsReportName;
    this.help = help;
    this.pretty = pretty;
    this.exportNoticeSchema = exportNoticeSchema;
  }

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public String getOutputBase() {
    return outputBase;
  }

  public void setOutputBase(String outputBase) {
    this.outputBase = outputBase;
  }

  public int getNumThreads() {
    return numThreads;
  }

  public void setNumThreads(int numThreads) {
    this.numThreads = numThreads;
  }

  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getStorageDirectory() {
    return storageDirectory;
  }

  public void setStorageDirectory(String storageDirectory) {
    this.storageDirectory = storageDirectory;
  }

  public String getValidationReportName() {
    return validationReportName;
  }

  public void setValidationReportName(String validationReportName) {
    this.validationReportName = validationReportName;
  }

  public String getSystemErrorsReportName() {
    return systemErrorsReportName;
  }

  public void setSystemErrorsReportName(String systemErrorsReportName) {
    this.systemErrorsReportName = systemErrorsReportName;
  }

  public boolean isHelp() {
    return help;
  }

  public void setHelp(boolean help) {
    this.help = help;
  }

  public boolean isPretty() {
    return pretty;
  }

  public void setPretty(boolean pretty) {
    this.pretty = pretty;
  }

  public boolean isExportNoticeSchema() {
    return exportNoticeSchema;
  }

  public void setExportNoticeSchema(boolean exportNoticeSchema) {
    this.exportNoticeSchema = exportNoticeSchema;
  }

  public byte[] getZipFile() {
    return zipFile;
  }

  public void setZipFile(byte[] zipFile) {
    this.zipFile = zipFile;
  }

  public boolean abortAfterNoticeSchemaExport() {
    return input == null
            && countryCode == null
            && url == null
            && storageDirectory == null
            && validationReportName == null
            && systemErrorsReportName == null;
  }
}
