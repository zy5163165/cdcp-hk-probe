package callSNC;

/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCAndRoute_T(){}
	public subnetworkConnection.SubnetworkConnection_T connection;
	public subnetworkConnection.RouteDescriptor_T[] connectionRoutes;
	public mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks;
	public mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks;
	public java.lang.String routeType;
	public SNCAndRoute_T(subnetworkConnection.SubnetworkConnection_T connection, subnetworkConnection.RouteDescriptor_T[] connectionRoutes, mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks, mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks, java.lang.String routeType)
	{
		this.connection = connection;
		this.connectionRoutes = connectionRoutes;
		this.edgeMLSNPPLinks = edgeMLSNPPLinks;
		this.internalMLSNPPLinks = internalMLSNPPLinks;
		this.routeType = routeType;
	}
}
