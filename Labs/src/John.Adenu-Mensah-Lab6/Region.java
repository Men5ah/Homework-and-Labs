class Region {
    String name;
    int treesPlanted;

    public Region(String name, int treesPlanted){
        //this.name = name;
        setName(name);
        setTreesPlanted(treesPlanted);
        //this.treesPlanted = treesPlanted;
    }

    public String getName() {
        return name;
    }

    public int getTreesPlanted() {
        return treesPlanted;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTreesPlanted(int treesPlanted){
        this.treesPlanted = treesPlanted;
    }

    @Override
    public String toString() {
        return "Region [name=" + name + ", treesPlanted=" + treesPlanted + "]\n";
    }


}