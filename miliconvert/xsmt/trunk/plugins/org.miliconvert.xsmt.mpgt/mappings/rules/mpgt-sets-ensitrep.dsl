[consequence][]Règle {rule_name}=if(!$s.isSkip())EnsitrepSetRules.{rule_name}($s);
[condition][]Dans le set {setId} avec la position {setPos} =$s : MPGTWrapperSet(setId == "{setId}" && setPos =="{setPos}" )
[condition][]Dans le champ de ffirn {ffirn} avec la position {ffpos} alternative {fieldAlternative}=$f : MPGTWrapperField( ffirn=="{ffirn}" && ffPos == "{ffpos}" && currentAlternative=={fieldAlternative}) from $s.fields
[consequence][]NANA {cond}=if(!$s.isSkip())CommonSetRules.NANA($s,"{cond}");
[consequence][]LIGNE  {lignes}=if(!$s.isSkip())CommonSetRules.LIGNE($s,"{lignes}");
[consequence][]VI {mpgt}\={value}=if(!$s.isSkip())CommonSetRules.VI($s,null,"{mpgt}",{value});
[consequence][]VC {field}\={value}=if(!$s.isSkip())CommonSetRules.VC($s,"{field}",{value}));