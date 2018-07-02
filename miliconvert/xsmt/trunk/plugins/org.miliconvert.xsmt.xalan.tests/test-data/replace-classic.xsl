<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" 
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:xs="http://www.w3.org/2001/XMLSchema" 
		exclude-result-prefixes="xs">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
  <xsl:template match="/win32">
    <linux>
      <xsl:attribute name="xsi:noNamespaceSchemaLocation">/u/tom/pathl.xsd</xsl:attribute>
      <xsl:for-each select="path">
	<path>
	  <xsl:for-each select="@value">
	    <xsl:variable name="var_value" select="."/>
	    <!-- Résultat de la function Constant -->
	    <xsl:variable name="var_backslash" select="'\'"/>
	    <!-- Résultat de la function Constant -->
	    <xsl:variable name="var_slash" select="'/'"/>
	    <!-- Exécution de la fonction replace -->
	    <xsl:variable name="func-2_result" 
			  select="translate($var_value, $var_backslash, $var_slash)"/>
	    <xsl:attribute name="value">
	      <xsl:value-of select="$func-2_result"/>
	    </xsl:attribute>
	  </xsl:for-each>
	</path>
      </xsl:for-each>
    </linux>
  </xsl:template>
</xsl:stylesheet>
