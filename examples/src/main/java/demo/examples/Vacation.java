package demo.examples;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Vacation implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer id;
   private demo.examples.VacationRequest request;
   private java.lang.String status;

   public Vacation()
   {
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public demo.examples.VacationRequest getRequest()
   {
      return this.request;
   }

   public void setRequest(demo.examples.VacationRequest request)
   {
      this.request = request;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public Vacation(java.lang.Integer id,
         demo.examples.VacationRequest request, java.lang.String status)
   {
      this.id = id;
      this.request = request;
      this.status = status;
   }

}