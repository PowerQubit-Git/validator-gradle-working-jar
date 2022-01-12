package org.mobilitydata.gtfsvalidator.table;

import org.mobilitydata.gtfsvalidator.annotation.GtfsEnumValue;

@GtfsEnumValue(name = "Not_specified", value = 0)
@GtfsEnumValue(name = "School_period", value = 1)
@GtfsEnumValue(name = "School_holidays", value = 2)
public interface GtfsPeriodEnum {}