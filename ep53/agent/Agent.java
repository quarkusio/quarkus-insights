///usr/bin/env jbang "$0" "$@" ; exit $?
//// DEPS <avoid dependencies>
//JAVAAGENT Can-Redefine-Classes Can-Retransform-Classes Can-Set-Native-Method-Prefix
package agent;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static volatile Instrumentation inst;

    public static void premain(final String agentArgs, final Instrumentation instrumentation) {
       inst = instrumentation;
    }
}
