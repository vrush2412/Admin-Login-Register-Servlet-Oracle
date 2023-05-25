package linkcodeServices;

import java.util.List;

import Model.RegisterHere;

interface RegisterServices {
   public int createRecord(List<RegisterHere>lst);
   public int updateRecord(List<RegisterHere>lst);
  // public List<RegisterHere> searchRecord(int regno);
}
