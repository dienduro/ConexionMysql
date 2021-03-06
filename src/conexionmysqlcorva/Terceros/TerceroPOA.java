package Terceros;


/**
* Terceros/TerceroPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Terceros.idl
* mi�rcoles 26 de septiembre de 2018 21H16' COT
*/

public abstract class TerceroPOA extends org.omg.PortableServer.Servant
 implements Terceros.TerceroOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarTercero", new java.lang.Integer (0));
    _methods.put ("actualizarTercero", new java.lang.Integer (1));
    _methods.put ("eliminarTercero", new java.lang.Integer (2));
    _methods.put ("consultarTercero", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Terceros/Tercero/insertarTercero
       {
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarTercero (nombre, apellido, telefono);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Terceros/Tercero/actualizarTercero
       {
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         int id = in.read_long ();
         boolean $result = false;
         $result = this.actualizarTercero (nombre, apellido, telefono, id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Terceros/Tercero/eliminarTercero
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarTercero (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Terceros/Tercero/consultarTercero
       {
         int id = in.read_long ();
         String $result = null;
         $result = this.consultarTercero (id);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Terceros/Tercero/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Terceros/Tercero:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Tercero _this() 
  {
    return TerceroHelper.narrow(
    super._this_object());
  }

  public Tercero _this(org.omg.CORBA.ORB orb) 
  {
    return TerceroHelper.narrow(
    super._this_object(orb));
  }


} // class TerceroPOA
