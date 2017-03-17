package com.piccritic.database.license;

import javax.persistence.Entity;

/**
 * class definition.
 *
 * class implements the licensing information for a photo.
 *
 * @Author damienr74 <br>
 * teaswirll
 */
@Entity
public class AttributionNonComShareLicence extends License {
	public AttributionNonComShareLicence() {
		licenseType = ATTRIBUTION_NON_COMMERCIAL_SHAREALIKE;
		description = DATTRIBUTION_NON_COMMERCIAL_SHAREALIKE;
	}
}
