
/**
 * GarbageRecyclerMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.garbagerecycler;

        /**
        *  GarbageRecyclerMessageReceiverInOut message receiver
        */

        public class GarbageRecyclerMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GarbageRecyclerSkeleton skel = (GarbageRecyclerSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("registerUser".equals(methodName)){
                
                org.example.www.garbagerecycler.RegisterUserResponse registerUserResponse17 = null;
	                        org.example.www.garbagerecycler.RegisterUser wrappedParam =
                                                             (org.example.www.garbagerecycler.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecycler.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse17 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse17, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecycler/",
                                                    "registerUser"));
                                    } else 

            if("addRecyclingToUser".equals(methodName)){
                
                org.example.www.garbagerecycler.AddRecyclingToUserResponse addRecyclingToUserResponse19 = null;
	                        org.example.www.garbagerecycler.AddRecyclingToUser wrappedParam =
                                                             (org.example.www.garbagerecycler.AddRecyclingToUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecycler.AddRecyclingToUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRecyclingToUserResponse19 =
                                                   
                                                   
                                                         skel.addRecyclingToUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRecyclingToUserResponse19, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecycler/",
                                                    "addRecyclingToUser"));
                                    } else 

            if("getAllRecyclingFromUser".equals(methodName)){
                
                org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse getAllRecyclingFromUserResponse21 = null;
	                        org.example.www.garbagerecycler.GetAllRecyclingFromUser wrappedParam =
                                                             (org.example.www.garbagerecycler.GetAllRecyclingFromUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecycler.GetAllRecyclingFromUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingFromUserResponse21 =
                                                   
                                                   
                                                         skel.getAllRecyclingFromUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingFromUserResponse21, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecycler/",
                                                    "getAllRecyclingFromUser"));
                                    } else 

            if("getAllRecycling".equals(methodName)){
                
                org.example.www.garbagerecycler.GetAllRecyclingResponse getAllRecyclingResponse23 = null;
	                        org.example.www.garbagerecycler.GetAllRecycling wrappedParam =
                                                             (org.example.www.garbagerecycler.GetAllRecycling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbagerecycler.GetAllRecycling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingResponse23 =
                                                   
                                                   
                                                         skel.getAllRecycling(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingResponse23, false, new javax.xml.namespace.QName("http://www.example.org/GarbageRecycler/",
                                                    "getAllRecycling"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.AddRecyclingToUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.AddRecyclingToUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.AddRecyclingToUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.AddRecyclingToUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.GetAllRecyclingFromUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.GetAllRecyclingFromUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.GetAllRecycling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.GetAllRecycling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbagerecycler.GetAllRecyclingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbagerecycler.GetAllRecyclingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecycler.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecycler.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecycler.RegisterUserResponse wrapregisterUser(){
                                org.example.www.garbagerecycler.RegisterUserResponse wrappedElement = new org.example.www.garbagerecycler.RegisterUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecycler.AddRecyclingToUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecycler.AddRecyclingToUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecycler.AddRecyclingToUserResponse wrapaddRecyclingToUser(){
                                org.example.www.garbagerecycler.AddRecyclingToUserResponse wrappedElement = new org.example.www.garbagerecycler.AddRecyclingToUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse wrapgetAllRecyclingFromUser(){
                                org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse wrappedElement = new org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbagerecycler.GetAllRecyclingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbagerecycler.GetAllRecyclingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbagerecycler.GetAllRecyclingResponse wrapgetAllRecycling(){
                                org.example.www.garbagerecycler.GetAllRecyclingResponse wrappedElement = new org.example.www.garbagerecycler.GetAllRecyclingResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.garbagerecycler.RegisterUser.class.equals(type)){
                
                           return org.example.www.garbagerecycler.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.RegisterUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecycler.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.AddRecyclingToUser.class.equals(type)){
                
                           return org.example.www.garbagerecycler.AddRecyclingToUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.AddRecyclingToUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecycler.AddRecyclingToUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.GetAllRecyclingFromUser.class.equals(type)){
                
                           return org.example.www.garbagerecycler.GetAllRecyclingFromUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse.class.equals(type)){
                
                           return org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.GetAllRecycling.class.equals(type)){
                
                           return org.example.www.garbagerecycler.GetAllRecycling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbagerecycler.GetAllRecyclingResponse.class.equals(type)){
                
                           return org.example.www.garbagerecycler.GetAllRecyclingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    