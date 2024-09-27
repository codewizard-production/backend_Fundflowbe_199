package com.app.Fundflowbe.function;

import com.app.Fundflowbe.model.Stage;
import com.app.Fundflowbe.model.Startup;
import com.app.Fundflowbe.model.FundingRound;
import com.app.Fundflowbe.model.Founder;
import com.app.Fundflowbe.model.Document;
import com.app.Fundflowbe.model.Investor;
import com.app.Fundflowbe.enums.RoundStatus;
import com.app.Fundflowbe.enums.StageName;
import com.app.Fundflowbe.converter.StageNameConverter;
import com.app.Fundflowbe.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Fundflowbe.repository.FundingRoundRepository;
import com.app.Fundflowbe.repository.StageRepository;
import com.app.Fundflowbe.repository.DocumentRepository;
import com.app.Fundflowbe.repository.InvestorRepository;
import com.app.Fundflowbe.repository.FounderRepository;
import com.app.Fundflowbe.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
