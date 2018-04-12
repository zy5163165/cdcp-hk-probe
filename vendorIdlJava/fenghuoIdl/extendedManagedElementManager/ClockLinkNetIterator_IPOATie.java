package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ClockLinkNetIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ClockLinkNetIterator_IPOATie
	extends ClockLinkNetIterator_IPOA
{
	private ClockLinkNetIterator_IOperations _delegate;

	private POA _poa;
	public ClockLinkNetIterator_IPOATie(ClockLinkNetIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ClockLinkNetIterator_IPOATie(ClockLinkNetIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.ClockLinkNetIterator_I _this()
	{
		return extendedManagedElementManager.ClockLinkNetIterator_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.ClockLinkNetIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.ClockLinkNetIterator_IHelper.narrow(_this_object(orb));
	}
	public ClockLinkNetIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ClockLinkNetIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,clockLinkNetList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
