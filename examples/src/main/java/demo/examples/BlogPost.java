package demo.examples;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BlogPost implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String email;
   private demo.examples.Content content;

   public BlogPost()
   {
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public demo.examples.Content getContent()
   {
      return this.content;
   }

   public void setContent(demo.examples.Content content)
   {
      this.content = content;
   }

   public BlogPost(java.lang.String email, demo.examples.Content content)
   {
      this.email = email;
      this.content = content;
   }

}