package com.app.Fundflowbe.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "InvestorInvestmentPreferences")
@Table(schema = "\"fundflowbe\"", name = "\"InvestorInvestmentPreferences\"")
@Data
public class InvestorInvestmentPreferences{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InvestorId\"")
	private Integer investorId;

    
    @Column(name = "\"InvestmentPreferences\"")
    private Integer investmentPreferences;
}