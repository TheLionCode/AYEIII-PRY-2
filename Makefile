# Compiler and flags
KC = kotlinc
KFLAG = -cp 
LIBGRAPH = ./libGrafoKt/libGrafoKt.jar

# Default target
all: GrafoRKt.class

# Rule to compile GrafoR.kt using the libGrafoKt library
GrafoRKt.class: GrafoR.kt $(LIBGRAPH)
	$(KC) $(KFLAG) $(LIBGRAPH) GrafoR.kt

# Clean up build files
.PHONY: clean
clean:
	rm -rf *.class META-INF