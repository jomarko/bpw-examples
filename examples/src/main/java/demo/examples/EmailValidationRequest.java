package demo.examples;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EmailValidationRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Boolean valid;
   private java.lang.String email;

   public EmailValidationRequest()
   {
   }

   public java.lang.Boolean getValid()
   {
      return this.valid;
   }

   public void setValid(java.lang.Boolean valid)
   {
      this.valid = valid;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public EmailValidationRequest(java.lang.Boolean valid,
         java.lang.String email)
   {
      this.valid = valid;
      this.email = email;
   }

}