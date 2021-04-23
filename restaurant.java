/* choose from three locations: Andheri, Bandra, Juhu
   choose from 4 budget ranges: 2000, 1000, 500, 300
   choose choose from 3 cuisines: Indian, Chinese, Continental */

class blah
{ void restoPicker(int budget, String location, String cuisine)
  { String restaurants = ""; 
    switch (budget)
    { case 2000:
      if (cuisine == "Indian" || cuisine == "indian")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Glasshouse Hyatt Regency\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Meishi\n";
       }
      if (cuisine == "Chinese" || cuisine == "chinese")
      { if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Ming Yang\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Facing East\n";
       }
      if (cuisine == "Continental" || cuisine == "continental")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Culinary Tales\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Le Bar Diamantaire\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Same Place Same Time\n";

       }
      case 1000:
        if (cuisine == "Indian" || cuisine == "indian")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Vedge\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Glass Room\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "The Bombay Curry\n";
       }
      if (cuisine == "Chinese" || cuisine == "chinese")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Asian Eats\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Kook\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Wongs restobar\n";
       }
      if (cuisine == "Continental" || cuisine == "continental")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "MYX\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "The Adda\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Kale and Quinoa\n";
       }
      case 500:
        if (cuisine == "Indian" || cuisine == "indian")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Matka Khichdi\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Indian Tadka\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Chholay\n";
       }
      if (cuisine == "Chinese" || cuisine == "chinese")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Shaolin Express\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Fatty Bao\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "China Saffron\n";
       }
      if (cuisine == "Continental" || cuisine == "continental")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Wowchee\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "El Bistro\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "The Rising Dough\n";
       }
      case 300:
        if (cuisine == "Indian" || cuisine == "indian")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Masala Bay\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Madras cafe\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Swaad Manthan\n";
       }
      if (cuisine == "Chinese" || cuisine == "chinese")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "The Momo Factory\n";
        else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Xi's Chinese\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "The Cuisine Circus\n";
       }
      if (cuisine == "Continental" || cuisine == "continental")
      { if (location == "Andheri" || location == "andheri")
        restaurants = restaurants + "Paprika\n";
      	else if (location == "Bandra" || location == "bandra")
        restaurants = restaurants + "Food Mood Cafe\n";
        else if (location == "Juhu" || location == "juhu")
        restaurants = restaurants + "Fog City\n";
       }
     
     }
    if (restaurants == "")
    	System.out.print("There are no restaurants with your preferences.\n");
    else
    	System.out.print("These restaurants might be of your liking:\n" + restaurants);

   } 

 }
 class restaurant
 { public static void main(String args[])
   { blah o1 = new blah();
   	 o1.restoPicker(2000, "Juhu", "continental");

    }

  }