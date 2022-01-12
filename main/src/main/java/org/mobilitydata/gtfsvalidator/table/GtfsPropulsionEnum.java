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

@GtfsEnumValue(name = "Unknown_propulsion", value = 0)
@GtfsEnumValue(name = "Gasoline", value = 1)
@GtfsEnumValue(name = "Diesel", value = 2)
@GtfsEnumValue(name = "Lpg_auto", value = 3)
@GtfsEnumValue(name = "Mixture", value = 4)
@GtfsEnumValue(name = "Biodisel", value = 5)
@GtfsEnumValue(name = "Electricity", value = 6)
@GtfsEnumValue(name = "Hybrid", value = 7)
@GtfsEnumValue(name = "Natural_gas", value = 8)
@GtfsEnumValue(name = "Other", value = 9)
public interface GtfsPropulsionEnum {}
