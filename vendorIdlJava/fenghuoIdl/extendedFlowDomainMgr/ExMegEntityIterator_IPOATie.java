package extendedFlowDomainMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ExMegEntityIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ExMegEntityIterator_IPOATie
	extends ExMegEntityIterator_IPOA
{
	private ExMegEntityIterator_IOperations _delegate;

	private POA _poa;
	public ExMegEntityIterator_IPOATie(ExMegEntityIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExMegEntityIterator_IPOATie(ExMegEntityIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedFlowDomainMgr.ExMegEntityIterator_I _this()
	{
		return extendedFlowDomainMgr.ExMegEntityIterator_IHelper.narrow(_this_object());
	}
	public extendedFlowDomainMgr.ExMegEntityIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedFlowDomainMgr.ExMegEntityIterator_IHelper.narrow(_this_object(orb));
	}
	public ExMegEntityIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExMegEntityIterator_IOperations delegate)
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

	public boolean next_n(int how_many, extendedFlowDomainMgr.ExMegEntityList_THolder megList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,megList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
