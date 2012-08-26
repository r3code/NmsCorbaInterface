package notifications;


/**
 * Generated from IDL interface "EventIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class EventIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final notifications.EventIterator_I s)
	{
			any.insert_Object(s);
	}
	public static notifications.EventIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/notifications/EventIterator_I:1.0", "EventIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/EventIterator_I:1.0";
	}
	public static EventIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(notifications._EventIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final notifications.EventIterator_I s)
	{
		_out.write_Object(s);
	}
	public static notifications.EventIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof notifications.EventIterator_I)
		{
			return (notifications.EventIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/notifications/EventIterator_I:1.0"))
		{
			notifications._EventIterator_IStub stub;
			stub = new notifications._EventIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static notifications.EventIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof notifications.EventIterator_I)
		{
			return (notifications.EventIterator_I)obj;
		}
		else
		{
			notifications._EventIterator_IStub stub;
			stub = new notifications._EventIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}