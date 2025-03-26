KC = kotlinc
KFLAG = -cp
GLIB = .

TARGET_JAR = libGrafoKt.jar

KT_SOURCES = $(GLIB)/Color.kt \
             $(GLIB)/Lado.kt \
             $(GLIB)/Arco.kt \
             $(GLIB)/ArcoCosto.kt \
             $(GLIB)/Arista.kt \
             $(GLIB)/AristaCosto.kt \
             $(GLIB)/Grafo.kt \
             $(GLIB)/GrafoDirigido.kt \
             $(GLIB)/GrafoDirigidoCosto.kt \
             $(GLIB)/GrafoNoDirigido.kt \
             $(GLIB)/GrafoNoDirigidoCosto.kt

all: $(TARGET_JAR)

$(TARGET_JAR): $(KT_SOURCES)
	$(KC) -d $(GLIB) $(KT_SOURCES)
	jar -cvf $@ -C $(GLIB) .

.PHONY: clean
clean:
	rm -rf $(TARGET_JAR) META-INF $(GLIB)/*.class