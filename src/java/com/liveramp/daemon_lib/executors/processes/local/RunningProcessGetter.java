package com.liveramp.daemon_lib.executors.processes.local;

import java.util.List;
import java.util.Map;

import com.liveramp.daemon_lib.executors.processes.ProcessDefinition;
import com.liveramp.daemon_lib.executors.processes.ProcessMetadata;

public interface RunningProcessGetter<Pid, PidData, M extends ProcessMetadata> {

  class PidData {
    String command;

    @Override
    public String toString() {
      return "PidData{" +
          "command='" + command + '\'' +
          '}';
    }
  }

  Map<Pid, PidData> getPids(List<ProcessDefinition<M,Pid>> definitions) throws Exception;

}
