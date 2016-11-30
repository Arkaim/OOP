import java.util.*;

/**
 *  Class AudioDatabase
 *
 * @author  Kaimbayev
 * @version  1.0.0
 */
 public class AudioDatabase implements Iterable<AudioFile>{

	private ArrayList<AudioFile>files;

	public AudioDatabase(){

		this.files = new ArrayList<AudioFile>();
	}

	/**
	 * Add file
	 *
	 * @param audioFile.
	 */
	public void addFile(AudioFile audioFile){

		files.add(audioFile);
	}

	/**
	 * Remove file
	 *
	 * @param audioFile.
	 */
	public void removeFile(AudioFile audioFile){

		for (Iterator<AudioFile> i = files.iterator(); i.hasNext();) {

		   if (i.next() == audioFile) {

			   i.remove();
                return;

		   }
	   }
	}

	/**
	 * iterator
	 *
	 * @return iterator for files.
	 */
	public Iterator<AudioFile> iterator(){

		return this.files.iterator();
	}

	/**
	* method to get file
	*
	* @return element which name is needed
	*/
	public AudioFile getFile(String name){

		for(AudioFile element:files){

			if(element.getName().equals(name)){

				return element;
			}
		}
		return null;
	}

	/**
	* method to get number of files
	*
	* @return size of files array
	*/
	public int getNumberOfFiles(){

		return files.size();
	}

	/**
	* method to get array of file names
	*
	* @return fileNames array
	*/
	public String[] getFileNames(){

		String[] fileNames = new String[this.files.size()];

		int k = 0;

		for(MediaFile mediaFile: this.files){

			fileNames[k] = mediaFile.getName();
            k++;
        }

		return fileNames;
	}

	/**
	* method to get total duration
	*
	* @return total duration
	*/
	public int getDuration(){

		int res = 0;

		for(AudioFile element: files){

			res += element.getDuration();
		}

		return res;
	}

}
