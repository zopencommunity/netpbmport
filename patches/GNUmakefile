diff --git a/GNUmakefile b/GNUmakefile
index 9d02c6ba..da866fdd 100644
--- a/GNUmakefile
+++ b/GNUmakefile
@@ -548,10 +548,12 @@ check-tree : PALMMAPDIR ?= $(SRCDIR)/converter/other/pnmtopalm
 # If it already exists, rename and convert to an archive directory.
 # Use numbered backup.
 # Note: Renaming fails with old versions of mv which do not have -T.  
-
+# msf: we have no '-T' option, so just delete it
+#	   then mv -T --backup=numbered $(RESULTDIR) $(RESULTDIR).bak; 
+#
 resultdir-backup: FORCE
 	if [ -d $(RESULTDIR) ]; \
-	   then mv -T --backup=numbered $(RESULTDIR) $(RESULTDIR).bak; \
+	   then rm -rf $(RESULTDIR); \
 	fi; \
 	mkdir -p $(RESULTDIR); \
 
