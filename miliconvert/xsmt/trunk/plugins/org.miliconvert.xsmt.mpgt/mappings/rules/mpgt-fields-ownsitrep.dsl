[consequence][]VI {mpgt} de la LIGNE_{value}=CommonFieldRules.VI_LIGNE($s,$f,"{mpgt}","{value}");
[consequence][]VI {mpgt} "HO" {tmp} : LIGNE {ligne}=OwnsitrepFieldRules.VI_ETAT_OP($s,$f,"{mpgt}","{ligne}");
[consequence][]VD {mpgt} "HO" {tmp} : LIGNE {ligne}=OwnsitrepFieldRules.VD_ETAT_OP($s,$f,"{mpgt}","{ligne}");
[consequence][]VI {mpgt} nom {tmp} lignes {ligne}=OwnsitrepFieldRules.VI_NOM_ENTITE($s,$f,"{mpgt}","{ligne}");
[consequence][]CD A_LOCATION_TYPE pour traiter la conversion des valeurs {conv}=OwnsitrepFieldRules.CD_A_LOCATION_TYPE($s,$f,"{conv}");
[consequence][]Règle {rule_name}=OwnsitrepFieldRules.{rule_name}($s,$f);
[consequence][]Concaténation des {count} sous zones dans l'attribut {value}=OwnsitrepFieldRules.concatSubFields($s,$f,"{count}","{value}") ;

[consequence][]VI {mpgt}\={value}=CommonFieldRules.VI($s,$f,"{mpgt}",{value});
[consequence][]VD {mpgt}\={value}=CommonFieldRules.VD($s,$f,"{mpgt}",{value});
[consequence][]LIGNE {lignes}=CommonFieldRules.LIGNE($s,$f,"{lignes}");
[condition][]Dans le set {setId} avec la position {setPos} alternative {setAlternative}=$s : MPGTWrapperSet(setId == "{setId}" && setPos =="{setPos}", currentAlternative=={setAlternative} )
[condition][]Dans le champ de ffirn {ffirn} avec la position {ffpos} alternative {fieldAlternative}=$f : MPGTWrapperField( ffirn=="{ffirn}" && ffPos == "{ffpos}" && currentAlternative=={fieldAlternative})
[consequence][]NANA=CommonFieldRules.NANA($s,$f);
[consequence][]CD\=\({condition}\)=CommonFieldRules.CD($s,$f,"CD=({condition})");
[consequence][]CD {value}=System.out.println("value");
[consequence][]IF {cond}\={value}=CommonFieldRules.IF($s,$f,"{cond}",{value});



