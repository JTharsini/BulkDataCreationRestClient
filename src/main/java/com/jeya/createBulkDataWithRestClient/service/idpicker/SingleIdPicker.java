package com.jeya.createBulkDataWithRestClient.service.idpicker;

class SingleIdPicker implements IdPicker
{
  private String id;

  SingleIdPicker(String id)
  {
    this.id = id;
  }

  @Override
  public String next()
  {
    return id;
  }
}
