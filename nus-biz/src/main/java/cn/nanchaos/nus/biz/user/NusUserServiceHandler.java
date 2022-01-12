package cn.nanchaos.nus.biz.user;

import cn.nanchaos.nus.constant.ChaosConstant;
import cn.nanchaos.nus.mapper.NusUserDoMapper;
import cn.nanchaos.nus.model.NusUserDO;
import cn.nanchaos.nus.user.reqdto.NusUserSaveReqDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
@Service
public class NusUserServiceHandler {
    @Resource
    private NusUserDoMapper nusUserDoMapper;

    public Boolean saveNusUser(NusUserSaveReqDTO nusUserSaveReqDTO) {
        NusUserDO nusUserDO = NusUserDO.builder()
                .email(nusUserSaveReqDTO.getEmail())
                .build();
        int insert = nusUserDoMapper.insert(nusUserDO);
        return insert == ChaosConstant.INTEGER_ONE ? Boolean.TRUE : Boolean.FALSE;
    }
}
