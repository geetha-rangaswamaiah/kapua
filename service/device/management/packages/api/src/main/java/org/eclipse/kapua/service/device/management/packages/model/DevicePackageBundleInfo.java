/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.packages.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Device package bundle information definition.
 *
 * @since 1.0
 */
@XmlRootElement(name = "devicePackageBundleInfo")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(factoryClass = DevicePackageXmlRegistry.class, factoryMethod = "newDevicePackageBundleInfo")
public interface DevicePackageBundleInfo {

    /**
     * Get the package bundle name
     *
     * @return
     */
    @XmlElement(name = "name")
    String getName();

    /**
     * Set the package bundle name
     *
     * @param name
     */
    void setName(String name);

    /**
     * Get the package bundle version
     *
     * @return
     */
    @XmlElement(name = "version")
    String getVersion();

    /**
     * Set the package bundle version
     *
     * @param version
     */
    void setVersion(String version);
}
