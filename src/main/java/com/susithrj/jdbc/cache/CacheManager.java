package com.susithrj.jdbc.cache;

import java.util.Timer;
import java.util.TimerTask;

public class CacheManager {
    //todo - complete
   /* addtostore(); //call in startup
    upadateStore(); //(push ongoing critical data changes to store)
    clearstore();*/


   TimerTask task = new TimerTask() {
       @Override
       public void run() {
      //TODO set time to auto cache clear or set admin page button to clear cache and hook with db value like is cache clear required.
      // clearstore()
       }
   };
    Timer timer = new Timer(true);//daemon thread
     //   timer.scheduleAtFixedRate();

}
