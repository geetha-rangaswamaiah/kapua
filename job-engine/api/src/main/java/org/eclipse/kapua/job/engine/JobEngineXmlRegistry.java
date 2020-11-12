/*******************************************************************************
 * Copyright (c) 2018, 2020 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.job.engine;

import org.eclipse.kapua.locator.KapuaLocator;

public class JobEngineXmlRegistry {

    private static final JobEngineFactory JOB_ENGINE_FACTORY = KapuaLocator.getInstance().getFactory(JobEngineFactory.class);

    public JobStartOptions newJobStartOptions() {
        return JOB_ENGINE_FACTORY.newJobStartOptions();
    }
}
