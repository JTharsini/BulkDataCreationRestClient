package com.jeya.createBulkDataWithRestClient.service.idpicker;

public interface IdPicker
{
  String next();

  default int size() {
    return 1;
  }
}
