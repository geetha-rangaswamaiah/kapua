/*******************************************************************************
 * Copyright (c) 2019, 2020 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.service.scheduler.trigger.definition;

import org.eclipse.kapua.model.query.KapuaListResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * {@link TriggerDefinitionListResult} definition.
 *
 * @since 1.1.0
 */
@XmlRootElement(name = "triggerDefinitionListResult")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(factoryClass = TriggerDefinitionXmlRegistry.class, factoryMethod = "newListResult")
public interface TriggerDefinitionListResult extends KapuaListResult<TriggerDefinition> {

}
