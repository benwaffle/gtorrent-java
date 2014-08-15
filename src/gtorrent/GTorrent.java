package gtorrent;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class GTorrent {
	public static GtorrentLibrary lib;
	static {
		Native.loadLibrary("stdc++", Dummy.class);
		Native.loadLibrary("torrent-rasterbar", Dummy.class);
	}
	public interface Dummy extends Library {}
    
    public static void main(String[] args) throws IOException {
    	GtorrentLibrary.gt_core_session_start(59585, 59585);
    
    	JFileChooser ch = new JFileChooser("/home/ben");
    	ch.setFileFilter(new FileNameExtensionFilter("Torrent files", "torrent"));
    	if (ch.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
    		System.out.println(ch.getSelectedFile().getAbsolutePath());
    
    	ByteBuffer str = ByteBuffer.allocate(1024);
    	GtorrentLibrary.gt_core_get_savepath(str);
    	System.out.println("save path: " + new String(str.array()));
    	
    	gt_trnt torrent = GtorrentLibrary.gt_trnt_create(ch.getSelectedFile().getAbsolutePath(), str);
    	GtorrentLibrary.gt_core_session_add_torrent(torrent);

    	System.out.println("downloading. enter to cancel");
    	System.in.read();
    	
    	GtorrentLibrary.gt_core_session_end();
    }
}
