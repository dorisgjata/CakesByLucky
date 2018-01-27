package com.cakes.cake;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class CreatOrder{

@Getter @Setter private String Shapes;
@Getter @Setter private String Size;
@Getter @Setter private int Tiers=0;
@Getter @Setter private int Layers=0;
@Getter @Setter private String Flavours;
@Getter @Setter private String Borders;
@Getter @Setter private String Icing;
@Getter @Setter private String Fillings;

@Override public String toString(){
    return String.format("Shapes: %s \n",Shapes);
    return String.format("Size: %s \n",Size);
    return String.format("Tiers: %d \n",Tiers);
    return String.format("Layers: %d \n",Layers);
    return String.format("Borders Colors: %s",Borders);
    return String.format("Flavours: %s \n",Flavours);
    return String.format("Icing: %s \n",Icing);
    return String.format("Fillings: %s \n",Fillings);
    
}



}