class Tile{
    private int edge;
    public Tile(int edge){
        this.edge = edge;
    }
    public int getEdge(){
        return edge;
    }
}
class Floor{
    private int length;
    private int width;
    
    public Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int totalTiles(Tile tile){
       int totalNumnberTilesNeeded =   (length*width) / (tile.getEdge()*tile.getEdge());
       return totalNumnberTilesNeeded;
    }
}
class TestMain{
    public static void main(String args[]){
        Tile t = new Tile(10); // t-->edge=10
        Floor f = new Floor(20,50); // f-->length=20,width=50

        int totalTiles = f.totalTiles(t); 
        System.out.println("Total Tiles Required : "+totalTiles);
    }
}