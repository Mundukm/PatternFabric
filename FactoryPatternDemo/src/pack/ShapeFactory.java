package pack;

public class ShapeFactory {

	public Shape getShape(String typeOfShape){
		
		if(typeOfShape == null){
			return null;
		} else if(typeOfShape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(typeOfShape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(typeOfShape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else{
			return null;
		}
		
		
		
		
	}
	
	
	
	
}
