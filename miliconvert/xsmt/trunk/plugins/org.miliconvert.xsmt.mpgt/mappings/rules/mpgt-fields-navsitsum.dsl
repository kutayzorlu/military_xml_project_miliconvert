[consequence][]Règle {rule_name}=NavsitsumFieldRules.{rule_name}($s,$f);

[consequence][]VI {mpgt}\={value}=CommonFieldRules.VI($s,$f,"{mpgt}",{value});
[consequence][]VD {mpgt}\={value}=CommonFieldRules.VD($s,$f,"{mpgt}",{value});
[consequence][]LIGNE {lignes}=CommonFieldRules.LIGNE($s,$f,"{lignes}");
[condition][]Dans le set {setId} avec la position {setPos} alternative {setAlternative}=$s : MPGTWrapperSet(setId == "{setId}" && setPos =="{setPos}", currentAlternative=={setAlternative} )
[condition][]Dans le champ de ffirn {ffirn} avec la position {ffpos} alternative {fieldAlternative}=$f : MPGTWrapperField( ffirn=="{ffirn}" && ffPos == "{ffpos}" && currentAlternative=={fieldAlternative})
[consequence][]NANA=CommonFieldRules.NANA($s,$f);
[consequence][]CD\=\({condition}\)=CommonFieldRules.CD($s,$f,"CD=({condition})");
[consequence][]CD {value}=System.out.println("value");
[consequence][]IF {cond}\={value}=CommonFieldRules.IF($s,$f,"{cond}",{value});