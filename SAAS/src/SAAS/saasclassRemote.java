/*
 * MATLAB Compiler: 4.18.1 (R2013a)
 * Date: Wed Apr 15 15:48:31 2015
 * Arguments: "-B" "macro_default" "-W" "java:SAAS,saasclass" "-T" "link:lib" "-d" 
 * "C:\\Program Files\\MATLAB\\R2013a\\bin\\SAAS\\src" "-N" "-p" "fuzzy" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" "class{saasclass:C:\\Program Files\\MATLAB\\R2013a\\bin\\dynafis5.m}" 
 */

package SAAS;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>saasclassRemote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  C:\\Program Files\\MATLAB\\R2013a\\bin\\dynafis5.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>saasclassRemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of SAAS.saasclass.
 */
public interface saasclassRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>dynafis5</code> M-function 
     * with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %X(1,1)=avail i/p
     * %X(1,2)=bw i/p
     * %X(1,3)=cost i/p
     * %X(1,4)=trust_avail i/p
     * %X(1,5)=trust_bw i/p
     * %Y(1,1)=availcust
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] dynafis5(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
