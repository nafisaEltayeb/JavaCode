import java.util.ArrayList;

public class Path {
	private String path;
	
	public Path(String path) {
		this.path=path;
	}
	
	public String getPath() {
		return path;
	}
	
	@SuppressWarnings("unchecked")
	public void cd(String newPath) {
		int i=0;
		String[] newPathArray = newPath.split("/");
		String[] pathArray = this.path.split("/");
		int newPathLength = newPathArray.length;
		
		@SuppressWarnings("rawtypes")
		ArrayList pathList =new ArrayList();
		
		for(int j=1; j<pathArray.length; j++) {
			pathList.add(pathArray[j]);
			
		}
		
		if(newPathArray[0].equals("")){
			pathList.clear();
			pathList.add(newPathArray[1]);
			i=i+2;
		}
		System.out.println(pathList);
		while(i<newPathLength) {
			int k = pathList.size()-1;
			if(newPathArray[i].equals("..")) {
				pathList.remove(k);
			}
			else {
				pathList.add(newPathArray[i]);
			}
			i++;
		}
		
		StringBuilder updatedPath = new StringBuilder();
		for(int l=0; l<pathList.size(); l++) {
			updatedPath.append("/"+pathList.get(l));
		}
		
		this.path =updatedPath.toString();
	}
	
	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		path.cd("../x");
		System.out.println(path.getPath());
	}

}
