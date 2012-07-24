
      package brs_repository.impl.contexts;

      // Component context class for WebServer3
      public class WebServer3Context implements brs_repository.impl.contexts.IWebServer3Context
      {
         
   protected brs_repository.IBRSSystem required_IBRSSystem_WebServer = null;

         
   public brs_repository.IBRSSystem getRoleRequired_IBRSSystem_WebServer() {
   	  if (required_IBRSSystem_WebServer == null) {
   	  	  throw new RuntimeException("Attempt to retrieve unbounded port. Check your architecture! "+
   	  	  		"Role Required_IBRSSystem_WebServer <_76rHENo5EdyCSNQKlT1LxA3> RequiringEntity WebServer3");
      }
      return required_IBRSSystem_WebServer;
   }

         
   public void setRoleRequired_IBRSSystem_WebServer(brs_repository.IBRSSystem newValue) {
      this.required_IBRSSystem_WebServer = newValue;
   }

         public WebServer3Context () {
         }
         
         
         public WebServer3Context (
            
   brs_repository.IBRSSystem required_IBRSSystem_WebServer
 ) {
            
   this.required_IBRSSystem_WebServer = required_IBRSSystem_WebServer;

         }
         
         
         

      }
   