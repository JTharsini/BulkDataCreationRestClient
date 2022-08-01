package com.jeya.createBulkDataWithRestClient.service.idpicker;

import java.util.ArrayList;
import java.util.List;

public class ListIdPicker implements IdPicker
{
  private List<String> ids;
  private int index = 0;
  private int size;
  private List<String> skips = new ArrayList<>();

  ListIdPicker(List<String> ids)
  {
    this.ids = ids;
    this.size = ids.size();
  }

  ListIdPicker(List<String> ids, List<String> skips)
  {
    this.ids = ids;
    this.size = ids.size();
    this.skips = skips;
  }

  @Override
  public String next()
  {
    String next = "";
    boolean notFound = true;
    while (notFound)
    {
      next = ids.get(index);
      index = (index < size - 1) ? ++index : 0;
      notFound = skips.contains(next);
    }
    return next;
  }

  @Override
  public int size()
  {
    return size;
  }
}
