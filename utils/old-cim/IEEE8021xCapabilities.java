/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class IEEE8021xCapabilities as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the IEEE8021xCapabilitiesBean Interface. The CIM class IEEE8021xCapabilities is
 * described as follows:
 * 
 * CIM_IEEE8021xCapabilities describes the IEEE 802.1x security capabilities of a layer 2 ProtocolEndpoint.
 */
public class IEEE8021xCapabilities extends Capabilities implements
		Serializable {

	/**
	 * This constructor creates a IEEE8021xCapabilitiesBeanImpl Class which implements the IEEE8021xCapabilitiesBean Interface, and encapsulates the
	 * CIM class IEEE8021xCapabilities in a Java Bean. The CIM class IEEE8021xCapabilities is described as follows:
	 * 
	 * CIM_IEEE8021xCapabilities describes the IEEE 802.1x security capabilities of a layer 2 ProtocolEndpoint.
	 */
	public IEEE8021xCapabilities() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property SupportedAuthenticationProtocols.
	 */

	public enum SupportedAuthenticationProtocols {
		EAP_TLS,
		EAP_TTLS_MSCHAPV2,
		PEAPV0_EAP_MSCHAPV2,
		PEAPV1_EAP_GTC,
		EAP_FAST_MSCHAPV2,
		EAP_FAST_GTC,
		EAP_MD5,
		EAP_PSK,
		EAP_SIM,
		EAP_AKA,
		EAP_FAST_TLS,
		DMTF_RESERVED
	}

	private SupportedAuthenticationProtocols	supportedAuthenticationProtocols;

	/**
	 * This method returns the IEEE8021xCapabilities.supportedAuthenticationProtocols property value. This property is described as follows:
	 * 
	 * The IEEE 802.1x Extensible Authentication Protocol types supported by the associated ProtocolEndpoint. See AuthenticationProtocol description
	 * in CIM_IEEE8021xSettings for more information.
	 * 
	 * @return int current supportedAuthenticationProtocols property value
	 * @exception Exception
	 */
	public SupportedAuthenticationProtocols
			getSupportedAuthenticationProtocols() {

		return this.supportedAuthenticationProtocols;
	} // getSupportedAuthenticationProtocols

	/**
	 * This method sets the IEEE8021xCapabilities.supportedAuthenticationProtocols property value. This property is described as follows:
	 * 
	 * The IEEE 802.1x Extensible Authentication Protocol types supported by the associated ProtocolEndpoint. See AuthenticationProtocol description
	 * in CIM_IEEE8021xSettings for more information.
	 * 
	 * @param int new supportedAuthenticationProtocols property value
	 * @exception Exception
	 */
	public void
			setSupportedAuthenticationProtocols(SupportedAuthenticationProtocols
					supportedAuthenticationProtocols) {

		this.supportedAuthenticationProtocols = supportedAuthenticationProtocols;
	} // setSupportedAuthenticationProtocols

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property roamingSupported.
	 */
	private boolean	roamingSupported;

	/**
	 * This method returns the IEEE8021xCapabilities.roamingSupported property value. This property is described as follows:
	 * 
	 * Indicates whether the associated ProtocolEndpoint supports moving a session due to roaming.
	 * 
	 * @return boolean current roamingSupported property value
	 * @exception Exception
	 */
	public boolean isRoamingSupported() {

		return this.roamingSupported;
	} // getRoamingSupported

	/**
	 * This method sets the IEEE8021xCapabilities.roamingSupported property value. This property is described as follows:
	 * 
	 * Indicates whether the associated ProtocolEndpoint supports moving a session due to roaming.
	 * 
	 * @param boolean new roamingSupported property value
	 * @exception Exception
	 */
	public void setRoamingSupported(boolean roamingSupported) {

		this.roamingSupported = roamingSupported;
	} // setRoamingSupported

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fastRoamingSupported.
	 */
	private boolean	fastRoamingSupported;

	/**
	 * This method returns the IEEE8021xCapabilities.fastRoamingSupported property value. This property is described as follows:
	 * 
	 * Indicates whether the associated ProtocolEndpoint supports fast reconnection of an IEEE 802.1x session when it roams from one access point to
	 * another.
	 * 
	 * @return boolean current fastRoamingSupported property value
	 * @exception Exception
	 */
	public boolean isFastRoamingSupported() {

		return this.fastRoamingSupported;
	} // getFastRoamingSupported

	/**
	 * This method sets the IEEE8021xCapabilities.fastRoamingSupported property value. This property is described as follows:
	 * 
	 * Indicates whether the associated ProtocolEndpoint supports fast reconnection of an IEEE 802.1x session when it roams from one access point to
	 * another.
	 * 
	 * @param boolean new fastRoamingSupported property value
	 * @exception Exception
	 */
	public void setFastRoamingSupported(boolean fastRoamingSupported) {

		this.fastRoamingSupported = fastRoamingSupported;
	} // setFastRoamingSupported

} // Class IEEE8021xCapabilities