/*
 * Copyright 2020 Google LLC
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

package org.mobilitydata.gtfsvalidator.table;

import org.mobilitydata.gtfsvalidator.annotation.GtfsEnumValue;

@GtfsEnumValue(name = "Unknown_typology", value = 0)
@GtfsEnumValue(name = "Urban_mini", value = 1)
@GtfsEnumValue(name = "Urban_midi", value = 2)
@GtfsEnumValue(name = "Urban_standard", value = 3)
@GtfsEnumValue(name = "Urban_articulated", value = 4)
@GtfsEnumValue(name = "Inter_urban_standard", value = 5)
@GtfsEnumValue(name = "Inter_urban_articulated", value = 6)
@GtfsEnumValue(name = "Tourism", value = 7)
public interface GtfsTypologyEnum {}
