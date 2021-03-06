package gtorrent;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/inttypes.h:544</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class gt_console extends Structure {
	/** C type : debug_callback* */
	public gt_console.debug_callback debug;
	/** C type : error_callback* */
	public gt_console.error_callback error;
	/** C type : timestamp_callback* */
	public gt_console.timestamp_callback timestamp;
	/** <i>native declaration : /usr/include/inttypes.h</i> */
	public interface debug_callback extends Callback {
		void apply(Pointer charPtr1, Object... varArgs1);
	};
	/** <i>native declaration : /usr/include/inttypes.h</i> */
	public interface error_callback extends Callback {
		void apply(Pointer charPtr1, Object... varArgs1);
	};
	/** <i>native declaration : /usr/include/inttypes.h</i> */
	public interface timestamp_callback extends Callback {
		void apply(Pointer charPtr1);
	};
	public gt_console() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("debug", "error", "timestamp");
	}
	/**
	 * @param debug C type : debug_callback*<br>
	 * @param error C type : error_callback*<br>
	 * @param timestamp C type : timestamp_callback*
	 */
	public gt_console(gt_console.debug_callback debug, gt_console.error_callback error, gt_console.timestamp_callback timestamp) {
		super();
		this.debug = debug;
		this.error = error;
		this.timestamp = timestamp;
	}
	public gt_console(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends gt_console implements Structure.ByReference {
		
	};
	public static class ByValue extends gt_console implements Structure.ByValue {
		
	};
}
