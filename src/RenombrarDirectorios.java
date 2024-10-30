import java.io.File;

public class RenombrarDirectorios {
    public void renombrarDirectorios(String path) {
        //Validar si es un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta no es valida");
            return;
        }
        //Renombrar los directorio
        System.out.println("La ruta es valida");

        //Renombrar directorios internos
        public void renombrarDirectoriosInternos(File directorio){
            //Listar todos los archivos o carpetass hijas
            File[] directoriosArchivosInternos = directorio.listFiles();
            if (directoriosArchivosInternos == null) {
                return;
            }
            for (File directorioArchivos : directoriosArchivosInternos) {
                if (directorioArchivos.isDirectory()) {
                    String nombreOriginal = directorioArchivos.getName();
                    String nuevoNombre = "Nuevo: "+nombreOriginal;

                    File nuevoDirectorio = new File(directorio.getParent(), nuevoNombre);
                    if(directorioArchivos.renameTo(nuevoDirectorio)){
                        renombrarDirectoriosInternos(nuevoDirectorio);
                    }
                }
            }
        }
    }
}
