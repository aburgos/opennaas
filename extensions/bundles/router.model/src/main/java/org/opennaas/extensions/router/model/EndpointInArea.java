/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class EndpointInArea as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the EndpointInAreaBean Interface. The CIM class EndpointInArea is described as follows:
 * 
 * This relation connects an OSPF endpoint to an area.
 */
public class EndpointInArea extends Component implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -1988272426988632938L;

	/**
	 * This constructor creates a EndpointInAreaBeanImpl Class which implements the EndpointInAreaBean Interface, and encapsulates the CIM class
	 * EndpointInArea in a Java Bean. The CIM class EndpointInArea is described as follows:
	 * 
	 * This relation connects an OSPF endpoint to an area.
	 */
	public EndpointInArea() {
	};

	/**
	 * This method create an Association of the type EndpointInArea between one OSPFArea object and OSPFProtocolEndpointBase object
	 */
	public static EndpointInArea link(OSPFArea
			groupComponent, OSPFProtocolEndpointBase partComponent) {

		return (EndpointInArea) Association.link(EndpointInArea.class, groupComponent, partComponent);
	}// link

} // Class EndpointInArea