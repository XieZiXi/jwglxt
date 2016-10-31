package f4.web.service.impl;

import org.springframework.stereotype.Service;

import f4.web.entity.Dictionary;
import f4.web.service.DictionaryService;

@Service("dictionaryService")
public class DictionaryServiceImpl extends BaseServiceImpl<Dictionary,Integer> implements DictionaryService {

}
