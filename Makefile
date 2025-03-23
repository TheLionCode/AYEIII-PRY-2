KC=		kotlinc
KFLAG=		-cp
LIBGRAPH=	./libGrafoKt/libGrafoKt.jar

all:	MainKt.class

MainKt.class: Main.kt 
	$(KC) $(KFLAG) $(LIBGRAPH) Main.kt
clean:
	rm -rf *.class META-INF 
