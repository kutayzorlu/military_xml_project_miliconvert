<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                xmlns:constant2="xalan://org.miliconvert.xsmt.functions.core.Constant" 
                xmlns:replace1="xalan://org.miliconvert.xsmt.functions.core.Replace" 

                xmlns:xalanmap0="xalan://org.miliconvert.xsmt.tmodel.functions.XalanMap"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                exclude-result-prefixes="xs xalanmap0 replace1 constant2" version="1.0">
  <xsl:output encoding="utf-8" indent="yes" method="xml"/>

  <xsl:variable name="func-0" select="replace1:new()"/>

  <xsl:variable name="init_func-1" select="xalanmap0:new()"/>
  <xsl:variable name="tmpvar3" 
	  		  select="xalanmap0:addItem($init_func-1, 'value', '/')"/>
  <xsl:variable name="tmpvar4" 
              select="xalanmap0:addItem($tmpvar3, 'type', 'string')"/>
  <xsl:variable name="func-1" select="constant2:new($tmpvar4)"/>

  <xsl:variable name="init_func-2" select="xalanmap0:new()"/>
  <xsl:variable name="tmpvar5" 
              select="xalanmap0:addItem($init_func-2, 'value', '\')"/>
  <xsl:variable name="tmpvar6" 
              select="xalanmap0:addItem($tmpvar5, 'type', 'string')"/>
  <xsl:variable name="func-2" select="constant2:new($tmpvar6)"/>

  <xsl:template match="/win32">

    <linux>
      <xsl:attribute name="xsi:noNamespaceSchemaLocation">/u/tom/pathl.xsd</xsl:attribute>
      
      <xsl:for-each select="path">
	<path>
	  <xsl:variable name="func-1_result" 
			select="constant2:execute($func-1)"/>
	  <xsl:variable name="func-2_result" 
			select="constant2:execute($func-2)"/>
	  
	  <xsl:attribute name="value">
	    <xsl:value-of 
  select="replace1:execute($func-0, $func-2_result, $func-1_result, string(@value))"/>

	  </xsl:attribute>
	</path>
      </xsl:for-each>
    </linux>
  </xsl:template>
</xsl:stylesheet>
