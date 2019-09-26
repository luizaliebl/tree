package impl;

public class File {
	
	private int size;
	private String name;
	private boolean file;
	private boolean directory;
	
	public File(int size, String name, boolean file, boolean directory) {
		setSize(size);
		setName(name);
		setFile(file);
		setDirectory(directory);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFile() {
		return file;
	}
	public void setFile(boolean file) {
		this.file = file;
	}
	public boolean isDirectory() {
		return directory;
	}
	public void setDirectory(boolean directory) {
		this.directory = directory;
	}

	@Override
	public String toString() {
		return "File [size=" + size + ", name=" + name + ", file=" + file + ", directory=" + directory + "]";
	}
	
	

}
