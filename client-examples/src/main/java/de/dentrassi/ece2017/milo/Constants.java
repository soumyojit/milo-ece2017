/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.ece2017.milo;

public final class Constants {
    private Constants() {
    }

    // public static final String HOST = "apollo.muc.redhat.com";
    // public static final String HOST = "localhost";
    // public static final String HOST = "[fe80::2c82:aeff:fe0b:ac2%enp0s31f6]";
    public static final String HOST = System.getProperty("host", "localhost");
    public static final int PORT = Integer.getInteger("port", 4840);
}
