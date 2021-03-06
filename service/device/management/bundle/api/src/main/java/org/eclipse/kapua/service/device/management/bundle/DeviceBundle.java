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
package org.eclipse.kapua.service.device.management.bundle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Device bundle entity definition.<br>
 * This entity is used to get information about bundles installed in the device.
 *
 * @since 1.0
 */
@XmlRootElement(name = "bundle")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(factoryClass = DeviceBundleXmlRegistry.class, factoryMethod = "newDeviceBundle")
public interface DeviceBundle {

    /**
     * Get the bundle identifier
     *
     * @return
     */
    @XmlElement(name = "id")
    long getId();

    /**
     * Set the bundle identifier
     *
     * @param id
     */
    void setId(long id);

    /**
     * Get the bundle name
     *
     * @return
     */
    @XmlElement(name = "name")
    String getName();

    /**
     * Set the bundle name
     *
     * @param name
     */
    void setName(String name);

    /**
     * Get the bundle state
     *
     * @return
     */
    @XmlElement(name = "state")
    String getState();

    /**
     * Set the bundle state
     *
     * @param state
     */
    void setState(String state);

    /**
     * Get the bundle version
     *
     * @return
     */
    @XmlElement(name = "version")
    String getVersion();

    /**
     * Set the bundle version
     *
     * @param version
     */
    void setVersion(String version);

}
