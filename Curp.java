public class Curp {
    String nombre;
    String ape1; //Primer Apellido
    String ape2; //Segundo Apellido
    String nacD; // Dia de nacimiento
    String nacM;// Mes de nacimiento
    String nacA; //Año de nacimiento
    String sexo;//Mujer/Hombre
    String entidad;
    String abreE;

    public Curp(String nombre, String ape1, String ape2, String nacD, String nacM, String nacA, String sexo, String entidad) {


        setNombre(nombre);
        setApe1(ape1);
        setApe2(ape2);
        setNacD(nacD);
        setNacM(nacM);
        setNacA(nacA);
        setSexo(sexo);
        setEntidad(entidad);


    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public void setNacD(String nacD) {
        this.nacD = nacD;
    }

    public void setNacM(String nacM) {
        this.nacM = nacM;

    }

    public void setNacA(String nacA) {
        this.nacA = nacA;

    }

    public void setSexo(String sexo) {
        this.sexo = sexo;

    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }


        String ape1M = ape1.substring(0,1);
        char ape2M = ape2.charAt(0);
        char nom = nombre. charAt(0);
        String nA = nacA.substring(3,4);
        String nM =nacM;
        String nD = nacD;
        char se = sexo.charAt(0);
        char ap1 = ape1.charAt(2);
        char ap2 = ape2.charAt(2);
        char nomb = nombre.charAt(2);

        if (entidad.equals("AGUASCALIENTES"))
        {

            abreE="AS";

        }
        else if (entidad.equals("BAJACALIFORNIA")){
            System.out.println("HOLA");

            abreE = "BC";

        }

        else if (entidad.equals("BAJACALIFORNIASUR")){

            abreE = "BS";

        }

        else if (entidad.equals("Campeche")){

            abreE = "CC";

        }

        else if (entidad.equals("Coahuila")){

            abreE = "CL";

        }

        else if (entidad.equals("Colima")){

            abreE = "CM";

        }

        else if (entidad.equals("Chiapas")){

            abreE = "CS";

        }

        else if (entidad.equals("Chihuahua")){

            abreE = "CH";

        }

        else if (entidad.equals("DistritoFederal")){

            abreE = "DF";

        }

        else if (entidad.equals("Durango")){

            abreE = "DG";

        }

        else if (entidad.equals("Guanajuato")){

            abreE = "GT";

        }

        else if (entidad.equals("Guerrero")){

            abreE = "GR";

        }

        else if (entidad.equals("Hidalgo")){

            abreE = "HG";

        }

        else if (entidad.equals("Jalisco")){

            abreE = "JC";

        }

        else if (entidad.equals("Mexico")){

            abreE= "MC";

        }

        else if (entidad.equals("Michoacan")){

            abreE = "MN";

        }

        else if (entidad.equals("Morelos")){

            abreE= "MS";

        }

        else if (entidad.equals("Nayarit")){

            abreE = "NT";

        }

        else if (entidad.equals("NuevoLeon")){

            abreE = "NL";

        }

        else if (entidad.equals("Oaxaca")){

            abreE = "OC";

        }

        else if (entidad.equals("Puebla")){

            abreE= "PL";

        }

        else if (entidad.equals("Queretaro")){

            abreE = "QT";

        }

        else if (entidad.equals("QuintanaRoo")){

            abreE= "QR";

        }

        else if (entidad.equals("SanLuisPotosi")){

            abreE = "SP";

        }

        else if (entidad.equals("Sinaloa")){

            abreE = "SL";

        }

        else if (entidad.equals("Sonora")){

            abreE = "SR";

        }

        else if (entidad.equals("Tabasco")){

            abreE = "TC";

        }

        else if (entidad.equals("Tamaulipas")){

            abreE = "TS";

        }

        else if (entidad.equals("Tlaxcala")){

            abreE = "TL";

        }

        else if (entidad.equals("Veracruz")){

            abreE = "VZ";

        }

        else if (entidad.equals("Yucatan")){

            abreE = "YN";

        }

        else if (entidad.equals("Zacatecas")){

            abreE = "ZS";

        }

        else if(entidad.equals("NacidoEnElExtranjero")){

            abreE = "NE";

        }


        System.out.println("El curp es: "+ape1M+ape2M+nom+nA+nM+nD+se+abreE+ap1+ap2+nomb);


}
